import java.util.Arrays;

public class Assignment2old {

	
	// task 1
	public static boolean isSquareMatrix(boolean[][] matrix) {
		if (matrix==null)//edge case
			return false;
		
		if(matrix.length==0)//must not be empty (aka n>0)
			return false;
		
		for(int i =0;i<matrix.length;i++) 
			if(matrix[i].length!=matrix.length)//checks if its not the same length
				return false;
		
		return true;
	}
	
	// task 2
	public static boolean isSymmetricMatrix(boolean[][] matrix) {
		for(int i=0;i<matrix.length;i++) 
			for(int j=i+1;j<matrix.length;j++)//run on all the columns in matrix[i], it starts in i+1 because matrix[i][i]==matrix[i][i] 
				//and for j's that are between 0-i we all ready checked
				if(matrix[i][j]!=matrix[j][i])//checks if its symmetrical
					return false;
		
		return true;
	}

	// task 3
	public static boolean isAntiReflexiveMatrix(boolean[][] matrix) {
		for(int i=0;i<matrix.length;i++)
			if(matrix[i][i]==true)//checks for reflexivity
				return false;
		
		return true;
	}
	
	// task 4
	public static boolean isLegalInstance(boolean[][] matrix) {
		if(matrix!=null && matrix.length==1)//edge case
			return true;
		

		if(isSquareMatrix(matrix) & isSymmetricMatrix(matrix) & isAntiReflexiveMatrix(matrix))//checks legal according to definition 1
				return true;
		

		return false;
	}
	
	// task 5
	public static boolean isPermutation(int[] array) {
		if(array.length==0)//edge case
			return true;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<0 | array[i]>=array.length)//checks if every cell is between 0 to length-1
				return false;
				
			for(int j=i+1;j<array.length;j++)//run on all the array that are greater than array[i]
				if( array[i]==array[j])//checks if identical
					return false;
			}//for
			
		return true;
	}
	
	
	
	
	// task 6
	public static boolean hasLegalSteps(boolean[][] flights, int[] tour) {
		if(flights==null || flights.length==0| tour==null | !isLegalInstance(flights))//flights must not be empty or null and legal ,tour can't be null
			return false;
		
		for(int i=0;i<tour.length-1;i++)  
			if(!flights[tour[i]][tour[i+1]])//checks for flights availability
				return false;
		
		if(!flights[tour[tour.length-1]][tour[0]])//checks for flights availability at the last flight
			return false;
		
		return true;
	}
	
	// task 7
	public static boolean isSolution(boolean[][] flights, int[] tour) {
		if(tour==null || tour.length!=flights.length)//tour must be same as number of citys
			throw new  IllegalArgumentException("tour must be same length as flights.");
		
		if(isPermutation(tour) & hasLegalSteps(flights,tour) & tour[0]==0 )//definition 2
			return true;
		
		return false;
	}
	
	// task 8
	public static boolean evaluate(int[][] cnf, boolean[] assign) {
		for(int i=0;i<cnf.length;i++) {
			boolean clauseIsTrue=false;
			
			for(int m=0;m<cnf[i].length & !clauseIsTrue;m++) //run on a clause until it finds a true statement
				if((cnf[i][m]>0 && assign[cnf[i][m]]) | (cnf[i][m]<0 && !assign[(cnf[i][m])*-1]))//checks for true statement, positive and true = true, negetive and false = true
					clauseIsTrue=true;
			
			if(!clauseIsTrue)
				return false;
		}//for
		
		return true;
	}
	
	
	
	// task 9
	public static int[][] atLeastOne(int[] lits) {
		int[][]cnf = new int[1][lits.length];
		for(int i =0;i<lits.length;i++)
			cnf[0][i]=lits[i];//placement of the cnf true statements
		return cnf;
	}
	
	// task 10
	public static int[][] atMostOne(int[] lits) {
		if(lits.length==1 ){
			int[][] cnf= {{lits[0],-1*lits[0]}};
			return cnf;
		}
		int sumOfLength=0;
		for(int i =0;i<lits.length;i++) //calculating how much length the cnf will be 
			sumOfLength+=i;
		
		int[][]cnf = new int[sumOfLength][2];
		int index = 0;//for running on the index on the cnf
		for(int i=0;i<sumOfLength;i++)
			for(int j=i+1;j<lits.length;j++,index++) {
				cnf[index][0]=-lits[i];
				cnf[index][1]=-lits[j];
			}
		return cnf;
	}
	
	// task 11
	public static int[][] exactlyOne(int[] lits) {
		
		int[][] cnfMost =atMostOne(lits);
		int[][] cnfAtLeast = atLeastOne(lits);
		int[][] cnfExacly = cnfUnite(cnfMost,cnfAtLeast);
		return cnfExacly;
	}
	
	public static int[][] cnfUnite(int[][] cnf1,int[][] cnf2) {//unite between 2 cnf's
		int[][] Newcnf = new int[cnf1.length+cnf2.length][];
		for(int i=0;i<cnf1.length;i++)
			Newcnf[i]=cnf1[i];
		for(int i=cnf1.length;i<Newcnf.length;i++) 
			Newcnf[i]=cnf2[i-cnf1.length];
		return Newcnf;
	}
	
	// task 12a
	public static int map(int i, int j, int n) {	
		return i*n+j+1;
	}
	
	// task 12b
	public static int[] reverseMap(int k, int n) {
		k--;
		int[] arrMap= {k/n,k%n};
		return arrMap;
	}
	
	// task 13
	public static int[][] oneCityInEachStep(int n) {
		int[][] OCIES = new int[0][];
		int[][] matrix = MatrixBuilder(n);
		for(int i=0;i<matrix.length;i++) {//building line by line the cnf we need
			int[][] cnfLines=exactlyOne(matrix[i]);
			OCIES=cnfUnite(OCIES,cnfLines);
		}
		return OCIES;
	}
	
	public static int[][] MatrixBuilder(int n) {//build a nxn matrix with maps in it
		int[][] matrix = new int[n][n];
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
				matrix[i][j]=map(i,j,n);
		return matrix;
	}
	// task 14
	public static int[][] eachCityIsVisitedOnce(int n) {
		int[][] ECIVO = new int[0][];
		int[][] matrix = matrixTilter(MatrixBuilder(n));//tilted matrix of the maps
		for(int i=0;i<matrix.length;i++) {//building column by column the cnf we need
			int[][] cnfLines=exactlyOne(matrix[i]);
			ECIVO=cnfUnite(ECIVO,cnfLines);
		}
		return ECIVO;		
	}
	
	public static int[][] matrixTilter(int[][] matrix) {//change the matrix to go by columns and not lines
		int[][] tiltMatrix = new int[matrix.length][matrix.length];
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
				tiltMatrix[i][j]=matrix[j][i];
		return tiltMatrix;
	}
	
	// task 15
	public static int[][] fixSourceCity(int n) {
		int[][] FSC = {{map(0,0,n)}};
		return FSC;
	}

	
	// task 16
		public static int[][] noIllegalSteps(boolean[][] flights) {
			int n = flights.length;
			int[][] NIS = new int[0][];
			int[] lits = new int[2];
			
			for(int j=0;j<n;j++)  
				for(int k=0;k<n;k++)
					if(!flights[j][k] & j!=k)//check for false and not because j is k
						for(int i=0;i<n;i++) {
							lits[0]=map(i,j,n);
							lits[1]=map((i+1)%n,k,n);
							NIS=cnfUnite(NIS,atMostOne(lits));//at most one of them must be true! - raz/ofir 2022
						}
			return NIS;
		}

	// task 17
	public static int[][] encode(boolean[][] flights) {
		int[][] cnfEC= new int[0][0];
		int citys = flights.length;
		cnfEC=cnfUnite(cnfEC,oneCityInEachStep(citys));	
		cnfEC=cnfUnite(cnfEC,eachCityIsVisitedOnce(citys));
		cnfEC=cnfUnite(cnfEC,fixSourceCity(citys));	
		cnfEC=cnfUnite(cnfEC,noIllegalSteps(flights));	
		return cnfEC;
	}
	
	public static void testerAss2() {
		boolean[][] f = {{false,false,true,true},{false,false,true,true},{true,true,false,true},{true,true,true,false}};
		int n=4;
		int[][] tour = {{0,3,1,2},{0,2,1,3}};
		System.out.println("test 1");
		System.out.println("testing:{{false,false,true,true},{false,false,true,true},{true,true,false,true},{true,true,true,false}}");
		if(oneCityInEachStep(n).length!=28)
			System.out.println("task 13 length is worng, it should be length of 28, but yours is"+oneCityInEachStep(n).length);
		else
			System.out.println("13:good");
		if(eachCityIsVisitedOnce(n).length!=28)
			System.out.println("task 14 length is worng, it should be length of 28, but yours is"+eachCityIsVisitedOnce(n).length);
		else
			System.out.println("14:good");
		if(fixSourceCity(n).length!=1)
			System.out.println("task 15 length is worng, it should be length of 1, but yours is"+fixSourceCity(n).length);
		else
			System.out.println("15:good");
		if(noIllegalSteps(f).length!=8)
			System.out.println("task 16 length is worng, it should be length of 8, but yours is"+noIllegalSteps(f).length);
		else
			System.out.println("16:good");
		int[] nottour= solve(f);
		if((!Arrays.equals(nottour, tour[0])) & (!Arrays.equals(nottour, tour[1])))
		{
			System.out.println("task 19 tour is worng, it should be {0,2,1,3} or {0,3,1,2} , but yours is:");
			System.out.print("{");
			for(int i=0;i<nottour.length-1;i++) {
				System.out.print(nottour[i]+",");
			}
			System.out.print(nottour[nottour.length-1]);
			System.out.println("}");
		}
		else
			System.out.println("19:good");
		if(solve2(f))
			System.out.println("task 20 should be false");
		else
			System.out.println("20:good");
		
		System.out.println(); System.out.println();
		
		boolean[][] fl = {{false,true,false,false,true,false},{true,false,false,false,false,true},{false,false,false,true,false,true},{false,false,true,false,true,false},{true,false,false,true,false,false},{false,true,true,false,false,false}};
		n=6;
		int[][] tour1 = {{0,1,5,2,3,4},{0,4,3,2,5,1}};
		System.out.println("test 2");
		System.out.println("testing:{{false,true,false,false,true,false},{true,false,false,false,false,true},{false,false,false,true,false,true}");
		System.out.println(",{false,false,true,false,true,false},{true,false,false,true,false,false},{false,true,true,false,false,false}};");
		if(oneCityInEachStep(n).length!=96)
			System.out.println("task 13 length is worng, it should be length of 96, but yours is " + oneCityInEachStep(n).length);
		else
			System.out.println("13:good");
		if(eachCityIsVisitedOnce(n).length!=96)
			System.out.println("task 14 length is worng, it should be length of 96, but yours is " + eachCityIsVisitedOnce(n).length);
		else
			System.out.println("14:good");
		if(fixSourceCity(n).length!=1)
			System.out.println("task 15 length is worng, it should be length of 1, but yours is " +fixSourceCity(n).length);
		else
			System.out.println("15:good");
		if(noIllegalSteps(fl).length!=108)
			System.out.println("task 16 length is worng, it should be length of 108, but yours is " +noIllegalSteps(fl).length);
		else
			System.out.println("16:good");
		int[] nottour1= solve(fl);
		if(!Arrays.equals(nottour1, tour1[0]) & (!Arrays.equals(nottour1, tour1[1])))
		{
			System.out.println("task 19 tour is worng, it should be {0,1,5,2,3,4} or {0,4,3,2,5,1} , but yours is:");
			System.out.print("{");
			for(int i=0;i<nottour1.length-1;i++) {
				System.out.print(nottour1[i]+",");
			}
			System.out.print(nottour[nottour1.length-1]);
			System.out.println("}");
		}
		else
			System.out.println("19:good");
		if(solve2(fl))
			System.out.println("task 20 should be false");
		else
			System.out.println("20:good");
		
		System.out.println(); System.out.println();
		
		boolean[][] f2 = {{false,true,false,false,true},{true,false,true,true,false},{false,true,false,true,true},{false,true,true,false,true},{true,false,true,true,false}};
		n=5;
		int[][] tour2 = {{0,1,2,3,4},{0,1,3,2,4},{0,4,3,2,1},{0,4,2,3,1}};
		System.out.println("test 3");
		System.out.println("false,true,false,false,true},{true,false,true,true,false},{false,true,false,true,true},{false,true,true,false,true},{true,false,true,true,false}}");
		if(oneCityInEachStep(n).length!=55)
			System.out.println("task 13 length is worng, it should be length of 96, but yours is " + oneCityInEachStep(n).length);
		else
			System.out.println("13:good");
		if(eachCityIsVisitedOnce(n).length!=55)
			System.out.println("task 14 length is worng, it should be length of 96, but yours is " + eachCityIsVisitedOnce(n).length);
		else
			System.out.println("14:good");
		if(fixSourceCity(n).length!=1)
			System.out.println("task 15 length is worng, it should be length of 1, but yours is " +fixSourceCity(n).length);
		else
			System.out.println("15:good");
		if(noIllegalSteps(f2).length!=30)
			System.out.println("task 16 length is worng, it should be length of 30, but yours is " +noIllegalSteps(f2).length);
		else
			System.out.println("16:good");
		int[] nottour2= solve(f2);
		if(!Arrays.equals(nottour2, tour2[0]) & !Arrays.equals(nottour2, tour2[1]) & !Arrays.equals(nottour2, tour2[2]) & (!Arrays.equals(nottour2, tour2[3])))
		{
			System.out.println("task 19 tour is worng, it should be {0,1,2,3,4} or {0,1,3,2,4} or {0,4,3,2,1} or {0,4,2,3,1} , but yours is:");
			System.out.print("{");
			for(int i=0;i<nottour2.length-1;i++) {
				System.out.print(nottour2[i]+",");
			}
			System.out.print(nottour[nottour2.length-1]);
			System.out.println("}");
		}
		else
			System.out.println("19:good");
		if(!solve2(f2))
			System.out.println("task 20 should be true");
		else
			System.out.println("20:good");
		
		System.out.println(); System.out.println();
	}
	// task 18
	public static int[] decode(boolean[] assignment, int n) {
		if(assignment==null || assignment.length!=n*n+1)
			throw new  IllegalArgumentException("Input not legal");
		
		int[] tour = new int[n];
		
		for(int i=0;i<tour.length;i++) {
			boolean found = false;//checks if we found the right map
			for(int j=0;j<assignment.length & !found;j++)
				if(assignment[map(i,j,n)]){//checks if its the right map 
					found=true;
					tour[i]=j;
				}
					
		}//for
		return tour;
	}
	
	// task19
	public static int[] solve(boolean[][] flights) {
		if( !isLegalInstance(flights))
			throw new IllegalArgumentException("flights isn't legal instance.");
		
		int nVars = flights.length*flights.length;//n^2
		SATSolver.init(nVars);
		int[][] cnf=encode(flights);
		SATSolver.addClauses(cnf);
		boolean[] tripCanHappen = SATSolver.getSolution();
		if (tripCanHappen == null)//checks if the sat couldn't find because of timeout
			throw new IllegalArgumentException("TIMEOUT.");
		else
		if (tripCanHappen.length == nVars+1) {//checks if the sat find a solution
			int[] tour=decode(tripCanHappen,flights.length);
			if(isSolution(flights,tour))
				return tour;
			else
				throw new IllegalArgumentException("Solution is illegal.");
		}//if
		else
			return null;
	}
	
	// task20
	public static boolean solve2(boolean[][] flights) {
				
		int[] tour1 = solve(flights);
		if(tour1==null)//checks if there is no answer from the beginning
			return false;
		
		int n= flights.length;
		int nVars = n*n;
		SATSolver.init(nVars);
		
		int[][] cnf=encode(flights);
		int[][] cnfNottour1 = new int[1][tour1.length-1];
		for(int i=1;i<tour1.length;i++)//creating new cnf that includes not beeing the first tour 
			cnfNottour1[0][i-1]=-map(i,tour1[i],n);
		cnf=cnfUnite(cnf,cnfNottour1);
		 
		int[] tour1Reversed=arrReversed(tour1);
		int[][] cnfNottour1Reversed = new int[1][tour1.length-1];
		for(int i=1;i<tour1.length;i++)//creating new cnf that includes not beeing the first tour but in reversed
			cnfNottour1Reversed[0][i-1]=-map(i,tour1Reversed[i],n);
		cnf=cnfUnite(cnf,cnfNottour1Reversed);
		
		SATSolver.addClauses(cnf);
		boolean[] tripCanHappen = SATSolver.getSolution();
		if (tripCanHappen == null || tripCanHappen.length == 0)//checks if the sat couldn't find because of timeout or no answer
			return false;
		else
			return true;//else we found that we have 2 different solutions
	}
	
	public static  int[] arrReversed(int[] arr1){//returns the array reversed for the tour with the same first city
	int[] Rarr1 = new int[arr1.length];
	Rarr1[0]=arr1[0];//the first city is the same
	for(int i=1;i<arr1.length;i++)//getting into Rarr1 the reversed sequence of the arr1
		Rarr1[i]=arr1[arr1.length-i];
	return Rarr1;	
	}
}