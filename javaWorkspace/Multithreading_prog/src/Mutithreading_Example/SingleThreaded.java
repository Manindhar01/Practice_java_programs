package Mutithreading_Example;

public class SingleThreaded {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreaded st=new SingleThreaded();
		st.Num();
		for(int j=1;j<=100;j++) {
			System.out.print("j:"+j+"\t");
		}
		}

		void Num() {
			for(int i=1;i<=100;i++) {
				System.out.print("i:"+i+"\t");
			}
	}

}
