import java.util.Scanner;


public class UI {
	GradeSystems gradesystem=new GradeSystems();
	Scanner s=new Scanner(System.in);
	UI(){
		System.out.println("輸入ID或 Q (結束使用)？");
		String stuID=s.nextLine();
		if(stuID=="Q"){
			System.exit(0);
		}
			
		this.checkID(stuID);
	}
	public void checkID(String ID){

		if(gradesystem.containsID(ID)){
			while(true){
				this.promptCommand();
				char op=s.nextLine().charAt(0);
				switch(op)
				{
					case 'G':
						gradesystem.showGrade(ID);
						break;
					case 'R':
						gradesystem.showRank(ID);
						break;
					case 'W':
						gradesystem.updateWeights();
						break;
					case 'E':
						System.exit(0);
						break;
				}
			}
		}else{
			
		}
	}
	public void promptCommand(){
		System.out.println("輸入指令 1) G 顯示成績 (Grade)");
		System.out.println("       2) R 顯示排名 (Rank)");
		System.out.println("       3) W 更新配分 (Weight)");
		System.out.println("       4) E 離開選單 (Exit)");

	}
	public void promptID(){
		
	}
	public void showFinishMsg(){
		
	}
	public void showWelcomeMsg(){
		System.out.println("Welcome 李威廷");
		//这里要修改！！！
	}
}
