public class SimpleLinkedList{
    public Element firstElement;
    private int length=0;
    public SimpleLinkedList(){
    this.firstElement=new Element(null);  
    }

public Element getElement(int index){
    Element currentElement = this.firstElement;
    for(int count=0;count<index;count++){
        if(null==currentElement){
            return null;
        }
        currentElement =currentElement.getNexElement();
    }
    return currentElement;
}
public Object get(int index){
    Element element=this.getElement(index);
    if(null==element){
        System.out.println("Element-"+index+" is not exist");
        return null;
    }
    return element.getData();
}

public boolean insert(int index,Object obj){
    if(index<1){
        System.out.println("Cannot insert:"+index);
        return false;
    }
    Element previous=this.getElement(index -1);//前のデータ
    if(previous==null){
        System.out.println("Cannot insert:"+index);
        return false;
    }
    Element element=new Element(obj);//挿入したいデータ
    element.setNextElement(previous.getNexElement());//次のデータ
    previous.setNextElement(element);//
    this.length++;
    return true;
}
public boolean remove(int index){
    if(index<1){
        System.out.println("Cannot remove:"+index);
        return false;
    }
    Element removeElement =this.getElement(index);
    if(null==removeElement){
        System.out.println("Cannot remove:"+index);
        return false;
    }
    Element previous =this.getElement (index-1);
    previous.setNextElement(removeElement.getNexElement());
    removeElement.setNextElement(null);
    this.length--;
    return true;
}
public void printAll(){
    int count=0;
    Element crrentElement=this.firstElement.getNexElement();
    while(crrentElement!=null){
        count++;
        System.out.println(count+":"+crrentElement);
        crrentElement=crrentElement.getNexElement();
    }
    System.out.println();
}
    
    public int getLength(){
	return this.length;
    }
    public boolean append(Object obj){
	
	boolean a=this.insert(this.length,obj);
	return a;
    }
    public int search(Object obj) {
	Element c=this.firstElement.getNexElement();
	int i=1;
	while(c!=null){
	 
	  
	    if(c.getData().equals(obj)){
		return i;
	    }
	     c=c.getNexElement();
	     i++;
	}
	System.out.println("Not found:"+obj);
	return -1;
    }
    public boolean remove(Object obj){
	int a=this.search(obj);
	if(a==-1){
	    System.out.println("Cannot remove:"+obj);
	    return false;
	}
	else{
	    this.remove(a);
	    return true;
	}
    }
    public boolean insertList(SimpleLinkedList list, int index){
	
	if(index<1||index>this.length){
	     System.out.println("Cannot insert list: index out of bounds");
	    return false;
	}
	if(list.getLength()==0){
	    System.out.println("Cannot insert list: insert list is empty");
	    return false;
	}
  Element previous=this.getElement(index -1);
  Element element=previous.getNexElement();
  previous.setNextElement(list.getElement(1));
  list.getElement(list.getLength()).setNextElement(element);
  this.length+=list.getLength();
  
	return true;
    }
    public boolean cut(int from, int to){
	if(from>to){
	    System.out.println("Cannot cut list: from is bigger than to");
	    return false;
	}
	if(from<1||from>this.length||to<1||to>this.length){
	    System.out.println("Cannot cut list: index out of bounds");
	    return false;
	}
	Element froml=this.getElement(from-1);
	Element tol=this.getElement(to+1);
	froml.setNextElement(tol);
	this.length-=(to-from+1);
	return true;
    }
    public boolean stringListSort(){
	String si;
	String st;
	for(int i=1;i<=this.length;i++){
	    for(int t=1;t<=this.length;t++){
		si=(String)this.get(i);
		st=(String)this.get(t);
		if(si.compareTo(st)<0){
		    Object oi=this.get(i);
		    Object ot=this.get(t);
		    this.remove(i);
		    this.insert(i,ot);
		    this.remove(t);
		    this.insert(t,oi);
		    
		    
		}
	    }
	}
	return true;
    }
    
}
