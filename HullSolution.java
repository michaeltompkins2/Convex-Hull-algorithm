package cs4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Pair {
    int one;
    int two;
    public Pair(int one, int two) {
        this.one = one; this.two = two;
    }
}

public class Hull {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int N = scanner.nextInt();
        float[] x = new float[N];
        float[] y = new float[N];
        for (int i = 0; i < N; i += 1) {
            x[i] = scanner.nextFloat();
            y[i] = scanner.nextFloat();
        }

        List<Pair> hullSegments = new ArrayList<Pair>();

        for(int i = 0; i < N; i++) {
        	
        	for(int k = 0; k < N; k++) {
        		float a = y[k] - y[i];
        		float b = x[i] - x[k];
        		float c = ((x[i]*y[k]) - (y[i]*x[k]));
        		int lessthan = 0;
        		int greater = 0;
        		int equals = 0;
        			for(int j = 0; j< N; j++) {
        				if(a*x[j] + b*y[j] == c) {
        					equals++;
        					
        				}
        				if(a*x[j] + b*y[j] >= c ) {
        					greater++;
        		}	
        				else if(a*x[j] + b*y[j] <= c){
        					lessthan++;
        			} 		
        	}if(greater == 0 && i != k) {
        			Pair newone = new Pair(i, k);
        			hullSegments.add(newone);
        	}
        	else if(lessthan == 0 && i != k){
        		Pair newone = new Pair(i, k);
    			hullSegments.add(newone);
        	}
        	
        }
        }
        for(int a = 0; a < hullSegments.size(); a++) { //unfinished and extremely inefficient attempt to eliminate a point in the middle
        	int equalschekker = 0;
        	for(int b = 0; b <N; b++) {
        		if(hullSegments.get(a).one == b || hullSegments.get(a).two == b ) {
        			equalschekker++;
        		if(equalschekker == 1) {
            		int p11 = hullSegments.get(a).one;
            		int p12 = hullSegments.get(a).two;
            		}
        		if(equalschekker == 2) {
            		int p21 = hullSegments.get(a).one;
            		int p22 = hullSegments.get(a).two;
            		}
        		if(equalschekker == 3) {
            		int p31 = hullSegments.get(a).one;
            		int p32 = hullSegments.get(a).two;
            		
            		}
            		
            	}
        		}
        	
        	}
        	
        	
        
        System.out.println(hullSegments.size());
        for (Pair p : hullSegments) {
            System.out.printf("%d %d\n", p.one, p.two);
    }




    }

	private static int sqrt(float f) {
		// TODO Auto-generated method stub
		return 0;
	}} 
