package kajol.com;
// problem statement 1
class Listloader{
	int[] intArray = new int[200] ;
	void loadList(int startNumber,int lastNumber) {
		for(int i = startNumber; i< lastNumber; i++) {
			intArray[i]=i;
		
		}
	}

}

public class Thread_Assignment {
	public static void main(String[] args) {
		Listloader obj = new Listloader();
		long start = System.currentTimeMillis();
	obj.loadList(0, 100);
	long end = System.currentTimeMillis();
	System.out.println("Responce Time in After exection start:"+(end-start));
	}
}