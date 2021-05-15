
public class MemoryLeak {
	public static void main(String[] args) {
		int memory1 = 2;
		int memory2 = 2;
		int[] arr = new int[3];
		int i = 1;
		while(i <= memory1 || i <= memory2) {
			if(memory2 > memory1) {
				memory2 -= i;
				i++;
			}
			else {
				memory1 -= i;
				i++;
			}
			
		}
		arr[0] = i;
		arr[1] = memory1;
		arr[2] = memory2;
		
	}

}
