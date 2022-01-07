package com.saurabh.array;

public class ArrayExample {

	public static void main(String[] args) {
          int a[][]= new int[5][5];
          int []b[]=new int[5][5];
          double[] c= new double[1];
          int []d[]=new int[5][5];
          int []e[]=new int[5][5];
          /*
           * 
           * Hashcode of array before assignment of value is same as after assignment of value
           * except d in which array a is cloned so by default array is recreated so hashcode 
           * is changed
           * 
          System.out.println("hashcode d :"+d.hashCode());
          System.out.println("hashcode a :"+a.hashCode());
          System.out.println("hashcode b :"+b.hashCode());*/
          /* all the elements in array are initialized with 0 */
          System.out.println("first "+d[1][2]);
          
          float[] f= new float[1];
          /*class name of float type array [F */
          System.out.println(f.getClass().getName());
          /*class name of double type array [D */
          System.out.println(c.getClass().getName());
          /*class name of int type array [[I */
          System.out.println(a.getClass().getName());
          System.out.println(b.getClass().getName());
          System.out.println(d.getClass().getName());
          
          for(int i=0;i<5;i++)
          {
        	  for(int j=0;j<5;j++)
        	  {
        		  a[i][j]=i+j;
        		  b[i][j]=a[i][j]+i+j;
        	  }
          }
          
          /*arrayCopy method copies to only given length it takes it as row number */
          System.arraycopy(b, 0, e, 0, 2);
          for(int i=0;i<e.length;i++) {
        	  System.out.println();
        	  for(int j=0;j<e.length;j++) {
        		  System.out.print(" ");
        	  System.out.print(e[i][j]);
        	  }
          }
          /*
           * clone method create clone same as a into d and
           * size of d also expands because a is larger than d
           * */
          d=a.clone();
          /*
           * Hashcodes of arrays after assignment of values 
           * hashcode of d is different then that of before because clone method create
           * a new object and assign it to the reference given
           * 
          System.out.println("Hash code of d :"+d.hashCode());
          System.out.println("hashcode a :"+a.hashCode());
          System.out.println("hashcode b :"+b.hashCode());*/
          System.out.println("d is "+d[4][4]);
          
          
          System.out.println("Array a ");
          for(int i=0;i<5;i++)
          {
        	  System.out.println();
        	  for(int j=0;j<5;j++)
        	  {
        		  System.out.print(" ");
        		 System.out.print(a[i][j]);
        	  }
          }
          
          System.out.println();
          System.out.println("Array b ");
          for(int i=0;i<5;i++)
          {
        	  System.out.println();
        	  for(int j=0;j<5;j++)
        	  {
        		  System.out.print(" ");
        		 System.out.print(b[i][j]);
        	  }
          }
          System.out.println();
          System.out.println("Addition of 2 arrays");
          for(int i=0;i<5;i++)
          {
        	  System.out.println();
        	  for(int j=0;j<5;j++)
        	  {
        		  System.out.print(" ");
        		 System.out.print(a[i][j]+b[i][j]);
        	  }
          }
          
	}

}
