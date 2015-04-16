
public class UI {
	GradeSystems gradesystem;
	public void UI(){
				
	}
	public boolean checkID(String ID){
		System.out.println("輸入ID或 Q (結束使用)？");
		//这里等待用户输入
		if(gradesystem.containsID(ID)){
			return true;
		}else{
			return false;
		}
	}
	public void promptCommand(){
		
	}
	public void promptID(){
		
	}
	public void showFinishMsg(){
		
	}
	public void showWelcomeMsg(){
		
	}
}
