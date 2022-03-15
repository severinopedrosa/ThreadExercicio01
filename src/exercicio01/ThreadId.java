package exercicio01;

public class ThreadId extends Thread {
		
		private int n;
		
		public ThreadId(int n) {
			this.n = n;
		}
		
		@Override
		public void run() {
			print();
		}
		
		private void print() {
			System.out.println("idThread => " + n);
		}

}
