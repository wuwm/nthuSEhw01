import java.util.Scanner;


public class UI {
	GradeSystems gradesystem;
	Scanner s=new Scanner(System.in);
	public void UI(){
				
	}
	public void checkID(String ID){
		System.out.println("輸入ID或 Q (結束使用)？");
		//这里等待用户输入
		if(gradesystem.containsID(ID)){
			this.promptCommand();
			char op=s.next().charAt(0);
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
					
					break;
			}
		}else{
			
		}
	}
	public void promptCommand(){
		System.out.println("輸入指令 1) G 顯示成績 (Grade)");
		System.out.println("2) R 顯示排名 (Rank)");
		System.out.println("3) W更新配分 (Weight)");
		System.out.println("4) E 離開選單 (Exit)");

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
