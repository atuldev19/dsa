/* A connected graph is semi-Eulerian if and only if it has exactly
two vertices of odd degree. */

import java.util.*;
public class SemiEulerainGraph
{
public static void main(String arg[])
{

int vertex; 
boolean flag=true;
int OddDegreeVertexCounter=0;

System.out.println("Enter number of vertex in a Connected Graph");

Scanner scn=new Scanner(System.in);
vertex=scn.nextInt();

int degree[]=new int[vertex];

System.out.println("Enter the degree of each vertex");
for(int i=0;i<vertex;i++)
{
degree[i]=scn.nextInt();
}

for(int i=0;i<vertex;i++)
{
	if(degree[i]%2==1)
	{
	OddDegreeVertexCounter++;
	}
}	

if(OddDegreeVertexCounter==2)
{
	System.out.println("The graph is Semi-Eulerian");
}
else
{
	System.out.println("The graph is not Semi-Eulerian");
}

}
}