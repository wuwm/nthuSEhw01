import java.util.Collections;
import java.util.LinkedList;


public class GradeSystems {
	private LinkedList<Grades> aList;
	private float weight[]={(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.3,(float) 0.4};
	public boolean containsID(String ID)
	{
		for(Grades g:aList)
		{
			if(g.getID()==ID)
			{
				return true;
			}
		}
		return false;
	}
	public GradeSystems () 
	{
		aList=new LinkedList<Grades>();
		//这里从文件添加！！！
	}
	public void showGrade(String ID)
	{
		for(Grades g:aList)
		{
			if(g.getID()==ID)
			{
				System.out.println(g.getName()+"成绩"+"：");
				System.out.println("lab1:     "+g.getLab1());
				System.out.println("lab2:     "+g.getLab2());
				System.out.println("lab3:     "+g.getLab3());
				System.out.println("mid-Term:     "+g.getMidTerm());
				System.out.println("final Term:     "+g.getFinalExam());
			}
		}
	}
	public void showRank(String ID)
	{
		Collections.sort(aList);
		for(Grades g:aList)
		{
			if(g.getID()==ID)
			{
				System.out.println(g.getName()+"排名第"+aList.indexOf(g));
			}
		}
	}
	public void updateWeights ()
	{
		System.out.println("舊配分");
		System.out.println("lab1:     "+this.weight[0]);
		System.out.println("lab2:     "+this.weight[1]);
		System.out.println("lab3:     "+this.weight[2]);
		System.out.println("mid-Term:     "+this.weight[3]);
		System.out.println("final Term:     "+this.weight[4]);
		System.out.println("輸入新配分");
		//这里需要做修改！！！！！！没写输入的东西！！！！！
		System.out.println("請確認新配分");
		System.out.println("lab1:     "+this.weight[0]);
		System.out.println("lab2:     "+this.weight[1]);
		System.out.println("lab3:     "+this.weight[2]);
		System.out.println("mid-Term:     "+this.weight[3]);
		System.out.println("final Term:     "+this.weight[4]);
	}

}
