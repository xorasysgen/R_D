package code.test.collections.methods;

import java.util.ArrayList;
//https://www.baeldung.com/java-multi-dimensional-arraylist
//https://www.baeldung.com/java-collections
public class ArrayList2DAnd3D {

	@SuppressWarnings("unused")
	private static void _3dArrayList() {
		int x_axis_length = 3;
        int y_axis_length = 3;
        int z_axis_length = 3;
        ArrayList< ArrayList< ArrayList<Integer> > > space = new ArrayList<>(x_axis_length);

        //Initializing each element of ArrayList with ArrayList< ArrayList<String> >
        for(int i = 0; i < x_axis_length; i++) {
            space.add(new ArrayList< ArrayList<Integer> >(y_axis_length));
            for(int j = 0; j < y_axis_length; j++) {
                space.get(i).add(new ArrayList<Integer>(z_axis_length));
                for(int k = 0; k < z_axis_length; k++) {
                	space.get(i).get(j).add(k);
                }
            }
        }

       

        //Printing colors for all the points
        for(int i = 0; i < x_axis_length; i++) {
            for(int j = 0; j < y_axis_length; j++) {
                for(int k = 0; k < z_axis_length; k++) {
                    System.out.println("Color of point ("+i+","+j+","+k+") is :"+space.get(i).get(j).get(k));
                }
            }
        }
        
        //Printing colors for all the points
        for(int i = 0; i < x_axis_length; i++) {
            for(int j = 0; j < y_axis_length; j++) {
            	System.out.println();
                for(int k = 0; k < z_axis_length; k++) {
                    System.out.print(space.get(i).get(j).get(k));
                }
            }
        }
        
        System.out.println(space);
    
	}
	
	
	private static void  _2DArrayList() {
		int row=5;
		int column=5;
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>(row);// create 2d arrayList
		for (int i = 0; i < row; i++) {
			graph.add(new ArrayList<Integer>()); // init arrayList
		}
		
		
		for (int i = 0; i < row; i++) {
		    for (int j = 0; j < column; j++) {
		    	System.out.println(graph.get(i).add(j));
		    }
		}
		
		for (int i = 0; i < row; i++) {
		    int edgeCount = graph.get(i).size();
		    for (int j = 0; j < edgeCount; j++) {
		        Integer startVertex = i;
		        Integer endVertex = graph.get(i).get(j);
		        System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
		    }
		}
		
		System.out.println(graph);
	}
	
	
	
	public static void main(String[] args) {
		ArrayList2DAnd3D._2DArrayList();
		//ArrayList2DAnd3D._3dArrayList();

	}

}
