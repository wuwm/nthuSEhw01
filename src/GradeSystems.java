import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class GradeSystems {
	private LinkedList<Grades> aList;
	private float weight[]={(float) 0.1,(float) 0.1,(float) 0.1,(float) 0.3,(float) 0.4};
	Scanner s=new Scanner(System.in);
	public boolean containsID(String ID)
	{
		for(Grades g:aList)
		{
			if(g.getID().compareTo(ID)==0)
			{
				return true;
			}
		}
		return false;
	}
	public GradeSystems () 
	{
		String info[];
		aList=new LinkedList<Grades>();
		File file = new File("gradeinput.txt");
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
            	info=tempString.split(" ");
            	Grades g=new Grades(info[0],info[1],info[2],info[3],info[4],info[5],info[6]);
            	g.calculateTotalGrade(this.weight);
            	aList.push(g);
            }
            reader.close();
            Collections.sort(aList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
	}
	public void showGrade(String ID)
	{
		for(Grades g:aList)
		{
			if(g.getID().compareTo(ID)==0)
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
		int rank=1;
		for(Grades g:aList)
		{
			if(g.getID().compareTo(ID)==0)
			{
				for(Grades gg:aList)
				{
					if(gg.getTotalGrade()>g.getTotalGrade())
					{
						rank++;
					}
				}
				System.out.println(g.getName()+"排名第"+rank);
				break;
			}
		}
	}
	private void showOldWeights()
	{
		System.out.println("舊配分");
		System.out.println("lab1:     "+this.weight[0]);
		System.out.println("lab2:     "+this.weight[1]);
		System.out.println("lab3:     "+this.weight[2]);
		System.out.println("mid-Term:     "+this.weight[3]);
		System.out.println("final Term:     "+this.weight[4]);
	}
	private void getNewWeights()
	{
		System.out.println("輸入新配分");
		System.out.print("lab1:     ");
		weight[0]=Float.parseFloat(s.nextLine());
		System.out.print("lab2:     ");
		weight[1]=Float.parseFloat(s.nextLine());
		System.out.print("lab3:     ");
		weight[2]=Float.parseFloat(s.nextLine());
		System.out.print("mid-Term:     ");
		weight[3]=Float.parseFloat(s.nextLine());
		System.out.print("final Term:     ");
		weight[4]=Float.parseFloat(s.nextLine());
	}
	private void verifyNewWeights()
	{
		System.out.println("請確認新配分");
		System.out.println("lab1:     "+this.weight[0]);
		System.out.println("lab2:     "+this.weight[1]);
		System.out.println("lab3:     "+this.weight[2]);
		System.out.println("mid-Term:     "+this.weight[3]);
		System.out.println("final Term:     "+this.weight[4]);
	}

	public void updateWeights ()
	{
		char op;
		showOldWeights();
		do{
			getNewWeights();
			verifyNewWeights();
			System.out.println("以上正確嗎? Y (Yes) 或 N (No)");
			op=s.nextLine().charAt(0);
		}while(op!='Y');
		for(Grades g:aList)
		{
			g.calculateTotalGrade(weight);
		}
	}

}
