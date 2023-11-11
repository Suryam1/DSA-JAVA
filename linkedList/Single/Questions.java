package linkedlist.single;

public class Questions {

	public Questions() {
		
		/*
		 * find max and min in list
		 * Swap nodes in the list
		 * sort the list in asc/desc and insert in the list
		 * find the middle of the list
		 * concatenate the lists and merge 2 sorted lists
		 * remove the duplicates in the sorted list
		 * check if list has cycle or not
		 * 
		 */
		
		
		
		//Floyds Algo -> Detect cycle or not
			/*
				Node slow=head,fast=head;
				if(head==null)
					return false;
				while(fast!=null||fast.next!=null){
					slow=slow.next;
					fast=fast.next.next;
					if(slow==fast)
						return true;
					
				}
				return false;
			*/
		
		//Finding middle
			/*			Node slow=head,fast=head;
			 * 			if(head!=null)
			 * 				while(fast!=null||fast.next!=null){
			 * 					fast=fast.next.next;
			 * 					slow=slow.next;
			 * 				}
			 * 			return slow.data;
			 */	
	}

}
