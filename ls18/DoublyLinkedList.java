public class DoublyLinkedList{
    private DoublyElement firstElement;
    private DoublyElement lastElement;
    private int length ;
    public DoublyLinkedList(){
	this.length=0;
        this.firstElement=new DoublyElement(null);
        this.lastElement=new DoublyElement(null);
        this.firstElement.setNextElement(this.lastElement);
        this.lastElement.setPreviousElement(this.firstElement);

    }
    public Object get(int index){
        DoublyElement element =this.getElement(index);
        if(null==element){
            System.out.println("Not exist:"+index);
            return null;
        }
        return element.getData();
    }
    public boolean insert(int index,Object obj){
        if(index<1){
            System.out.println("Cannnot insert:"+index);
            return false;
        }
        DoublyElement previous=this.getElement(index-1);
        if(previous==null){
            System.out.println("Cannot insert:"+index);
            return false;
        }
        DoublyElement element =new DoublyElement(obj);
        element.setNextElement(previous.getNextElement());
        previous.getNextElement().setPreviousElement(element);
        previous.setNextElement(element);
        element.setPreviousElement(previous);
	this.length++;
        return true;
    }
    public boolean remove(int index){
        if(index<1){
            System.out.println("Cannot remove:"+index);
            return false;
        }
        DoublyElement removElement=this.getElement(index);
        if(removElement==null){
            System.out.println("Cannot remove:"+index);
            return false;
        }
        DoublyElement previous=this.getElement(index-1);
        previous.setNextElement(removElement.getNextElement());
        removElement.getNextElement().setPreviousElement(previous);
        removElement.setNextElement(null);//つながり削除
        removElement.setPreviousElement(null);//つながり削除
	this.length--;
        return true;
    }
    private DoublyElement getElement(int index){
        DoublyElement currentElement=this.firstElement;
        for(int count=0;count<index;count++){
            currentElement=currentElement.getNextElement();
            if(currentElement==this.lastElement){
                return null;
            }
        }
        return currentElement;
    }
    public void printAll(){
        DoublyElement currentElement=this.firstElement.getNextElement();
        while(currentElement!=this.lastElement){
            System.out.println(currentElement);
            currentElement=currentElement.getNextElement();
            if(currentElement!=this.lastElement){
                System.out.println("<->");
            }
        }
        System.out.println();
    }
    public void printAllReverse(){
	DoublyElement currentElement=this.lastElement.getPreviousElement();
        while(currentElement!=this.firstElement){
            System.out.println(currentElement);
            currentElement=currentElement.getPreviousElement();
            if(currentElement!=this.firstElement){
                System.out.println("<->");
            }
        }
        System.out.println();
    }
    
    public int getLength() {
	return this.length;
    }
    public int searchForward(Object obj){
	DoublyElement currentElement=this.firstElement.getNextElement();
	int i=1;
        while(currentElement!=this.lastElement){
            if(currentElement.getData().equals(obj)){
		return i;
	    }
            i++;
	    currentElement=currentElement.getNextElement();
	    
        }
	return -1;
    }
    public int searchBackward(Object obj){
	DoublyElement currentElement=this.lastElement.getPreviousElement();
	int i=this.length;
        while(currentElement!=this.firstElement){
            if(currentElement.getData().equals(obj)){
		return i;
	    }
            i--;
	    currentElement=currentElement.getPreviousElement();
	    
        }
	return -1;
    }
    public boolean removeFromFirst(Object obj){
	DoublyElement currentElement=this.firstElement.getNextElement();
        while(currentElement!=this.lastElement){
            if(currentElement.getData().equals(obj)){
		
		DoublyElement previous=currentElement.getPreviousElement();
		previous.setNextElement(currentElement.getNextElement());
		currentElement.getNextElement().setPreviousElement(previous);
		currentElement.setNextElement(null);//つながり削除
		currentElement.setPreviousElement(null);//つながり削除
		this.length--;
		return true;
	    }
            
	    currentElement=currentElement.getNextElement();
	    
        }
	return false;
    }
    public boolean removeFromLast(Object obj){
	DoublyElement currentElement=this.lastElement.getPreviousElement();
        while(currentElement!=this.firstElement){
            if(currentElement.getData().equals(obj)){
		
		DoublyElement previous=currentElement.getPreviousElement();
		previous.setNextElement(currentElement.getNextElement());
		currentElement.getNextElement().setPreviousElement(previous);
		currentElement.setNextElement(null);//つながり削除
		currentElement.setPreviousElement(null);//つながり削除
		this.length--;
		return true;
	    }
            
	    currentElement=currentElement.getPreviousElement();
	    
        }
	return false;
    }
    public boolean cut(int from, int to){
	if(from>to){
	    System.out.println("Cannot cut list: from is bigger than to");
	    return false;
	}
	if(from<1){
	     System.out.println("Cannot cut list: from is smaller than 1");
	     return false;
	}
	if(from>this.length||to>this.length){
	    System.out.println("Cannot cut list: index out of bounds");
	    return false;
	}
	DoublyElement fromElement=this.getElement(from-1);
	DoublyElement toElement=this.getElement(to+1);
	fromElement.getNextElement().setPreviousElement(null);
	toElement.getPreviousElement().setNextElement(null);
	fromElement.setNextElement(toElement);
	toElement.setPreviousElement(fromElement);
	this.length-=(to-from+1);
	return true;
	
    }
    public DoublyLinkedList split(int index){
	if(index>this.length){
	    DoublyLinkedList relist=new DoublyLinkedList();
	    return relist; 
	}
	if(index<0){
	    return  new DoublyLinkedList();
	}
	 DoublyLinkedList relist=new DoublyLinkedList();
	 DoublyElement relist_p=this.getElement(index+1);
	  DoublyElement relist_e=this.getElement(this.length);
	 relist.firstElement.setNextElement(relist_p);
	 relist.lastElement.setPreviousElement(relist_e);
	 relist_p.setPreviousElement(relist.firstElement);
	 relist_e.setNextElement(relist.lastElement);
	 relist.length=(this.length-index);
	 DoublyElement listlast=this.getElement(index);
	 this.lastElement.setPreviousElement(listlast);
	 listlast.setNextElement(lastElement);
	 this.length=index;

	


    
	return relist;
	

	
	}
}

