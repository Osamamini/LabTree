package rmuti.labTree;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class App{
public static void main(String[]args){
	Node h=  new Node("h",null,null);
	Node i = new Node("i",null,null);
	Node e = new Node("e",h,i);
Node d = new Node("f",null,null);
Node b = new Node("b",e,d);
Node g = new Node("g",null,null);
Node f = new Node("f",null,null);
Node c = new Node("c",g,f);



Node root = new Node("a",b,c);
TreeDraw drawTree = new TreeDraw(root);
drawTree.binaryTreeDraw();
}
}