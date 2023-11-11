package heap;

public class Understanding {
	
	/*
	 * 		Full Binary Tree --> each node has zero or two children
	 * 		Perfect Binary Tree --> all nodes have two children and filled in level
	 * 		Complete Binary Tree --> when all its level are completely filled (from left to right order)
	 * 
	 * 
	 * 			 Min-Heap														 Max-Heap
	 * 				3																17
	 * 		    6        4														14      16
	 * 		  9   12   8   7  												  11   12  12 13
	 * 
	 * 
	 * 
	 *  Min-Heap-->The smallest value has the root of the tree.And, for every node,all the values under it 
	 *             are greater than the node
	 *             
	 *  Max-Heap-->The greatest value has the root of the tree.And, for every node,all the values under it 
	 *             are smaller than the node
	 *             
	 *             
	 * In array impl. the children of a node at index i are nodes at indices (2*i+1 and 2*i+2) or (2*i and 2*i+1).
	 * former is followed when array indexing starts from 0  and latter is followed when array indexing starts from 1
	 * 
	 * Now to get parent node of index i then the indice of parent node is floor(i/2) when indices starts from 1
	 * Now to get grandparent node of index i then the indice of grandparent node is floor(i/4),indices starts from 1
	 * 
	 *           
	 *  The insert and remove operations are of logn time
	 *  
	 *           
	 *     For inserting use upheapify() and for deleting use downheapify()      
	 *           
	 *           
	 *  Max Heap
	 *  	Insertion:       
	 *  			Insert 1:     1
	 *  
	 *  			Insert 2:    1 
	 *  						/
	 *  					   2
	 *  
	 *  			But not max-heap so heapify will swap
	 *  						  2
	 *  						 /	
	 *  	           			1
	 *  
	 *  			Insert 3:
	 *  						2
	 *  					   / \	
	 *  	           		  1   3
	 *  
	 *             heapify()
	 *             			   3
	 *             			  / \
	 *                       1   2
	 *                       
	 *             Insert 4:
	 *             			  3
	 *             			 / \
	 *             			1   2
	 *                     /
	 *                    4
	 *                    
	 *             heapify()
	 *             			3
	 *             		   / \
	 *             		  4   2
	 *                   /
	 *                  1 
	 *                        
	 *             heapify()
	 *             		   4
	 *             		  /	\
	 *                   3   2
	 *                  /
	 *                 1  
	 *                 
	 *                 
	 *             Delete
	 *             		  _
	 *             		 / \
	 *             		3   2
	 *                 /
	 *                1
	 *                
	 *             downheapify
	 *             			3
	 *             		   / \
	 *                    1   2
	 *                    
	 *             Delete
	 *             		    _
	 *             		   / \
	 *                    1   2
	 *                   
	 *             downheapify()
	 *             			2
	 *             		   /
	 *                    1
	 *                    
	 *                          
	 *                          
	 *   Algo for insertion
	 *   		Inc heap size
	 *   		keep new ele at end 
	 *   		call upheapify()
	 *   
	 *   Algo for deletion
	 *   		Copy first ele into variable
	 *   		copy last ele to first position
	 *   		call downheapify()	
	 *            		
	 *  						
	 *  					
	 *             
	 * 
	 */

}
