package q1.extract_method.refactored;

import java.util.List;


public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   extractedMethodNode(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   extractedMethodEdge(edgeList, p);
      // other implementation
      return null;
   }

   <T extends Node> void extractedMethodNode(List<T> objs, String p) {
	      for (T obj : objs) {
	         if (obj.contains(p))
	            System.out.println(obj);
	      }
	   }
   
   <T extends Edge> void extractedMethodEdge(List<T> objs, String p) {
	      for (T obj : objs) {
	         if (obj.contains(p))
	            System.out.println(obj);
	      }
	   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}