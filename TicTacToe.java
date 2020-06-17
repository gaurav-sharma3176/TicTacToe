import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
class TicTacToe
{
	 static int a[]=new int[9];
	 static int i,j=0,t=1;
	  //int a[0]=1;
	
	static int check()
	{
		if(a[0]==a[1]&&a[1]==a[2]&&a[2]==1 ||
		a[3]==a[4]&&a[4]==a[5]&&a[5]==1 ||
		a[6]==a[7]&&a[7]==a[8]&&a[8]==1 ||
		a[0]==a[3]&&a[3]==a[6]&&a[6]==1 ||
		a[1]==a[4]&&a[4]==a[7]&&a[7]==1 ||
		a[2]==a[5]&&a[5]==a[8]&&a[8]==1 ||
		a[0]==a[4]&&a[4]==a[8]&&a[8]==1 ||
		a[2]==a[4]&&a[4]==a[6]&&a[6]==1 )
			return 1;
		else if(a[0]==a[1]&&a[1]==a[2]&&a[2]==2 ||
		a[3]==a[4]&&a[4]==a[5]&&a[5]==2 ||
		a[6]==a[7]&&a[7]==a[8]&&a[8]==2 ||
		a[0]==a[3]&&a[3]==a[6]&&a[6]==2 ||
		a[1]==a[4]&&a[4]==a[7]&&a[7]==2 ||
		a[2]==a[5]&&a[5]==a[8]&&a[8]==2 ||
		a[0]==a[4]&&a[4]==a[8]&&a[8]==2 ||
		a[2]==a[4]&&a[4]==a[6]&&a[6]==2)
			return 1;
		else 
			return 0;
			
	}
	
	public static void main(String args[])
	{
		for(i=0;i<9;i++)
			a[i]=3;
		JFrame f=new JFrame("TicTacToe");
		JTextField tf=new JTextField("start...P1 Turn");
		tf.setBounds(0,0,320,100);
		
		Font fn=new Font(tf.getFont().getName(),tf.getFont().getStyle(),24);
		tf.setFont(fn);
		
		JButton a0=new JButton();
		a0.setBounds(0,100,100,100);
		Font bfn=new Font(a0.getFont().getName(),a0.getFont().getStyle(),40);
		a0.setFont(bfn);
		a0.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[0]==3)
					{
						a[0]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a0.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a0.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a0.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a0.setText("*");
							}
						}
						
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a1=new JButton();
		a1.setBounds(101,100,100,100);
		a1.setFont(bfn);
		a1.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[1]==3)
					{
						a[1]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a1.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a1.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a1.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a1.setText("*");
							}
						}
						
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a2=new JButton();
		a2.setBounds(201,100,100,100);
		a2.setFont(bfn);
		a2.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[2]==3)
					{
						a[2]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a2.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a2.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a2.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a2.setText("*");
							}
						}
						//a[2]=0;
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a3=new JButton();
		a3.setBounds(0,201,100,100);
		a3.setFont(bfn);
		a3.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[3]==3)
					{
						a[3]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a3.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a3.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a3.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a3.setText("*");
							}
						}
						//a[3]=0;
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a4=new JButton();
		a4.setBounds(101,201,100,100);
		a4.setFont(bfn);
		a4.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[4]==3)
					{
						a[4]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a4.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a4.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a4.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a4.setText("*");
							}
						}
						//a[4]=0;
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a5=new JButton();
		a5.setBounds(201,201,100,100);
		a5.setFont(bfn);
		a5.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[5]==3)
					{
						a[5]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a5.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a5.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a5.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a5.setText("*");
							}
						}
						//a[5]=0;
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a6=new JButton();
		a6.setBounds(0,301,100,100);
		a6.setFont(bfn);
		a6.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[6]==3)
					{
						a[6]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a6.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a6.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a6.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a6.setText("*");
							}
						}
						//a[6]=0;
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a7=new JButton();
		a7.setBounds(101,301,100,100);
		a7.setFont(bfn);
		a7.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[7]==3)
					{
						a[7]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a7.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a7.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a7.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a7.setText("*");
							}
						}
						//a[7]=0;
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
		
		JButton a8=new JButton();
		a8.setBounds(201,301,100,100);
		a8.setFont(bfn);
		a8.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					if(a[8]==3)
					{
						a[8]=t;
						i=check();
						if(i==1)
						{
							if(t==1)
							{
								tf.setText("Player 1 won");
								a8.setText("O");
							}
							else
							{
								tf.setText("Player 2 won");
								a8.setText("*");
							}
							
						}
						else
						{
							if(t==1)
							{
								t=2;
								a8.setText("O");
								tf.setText("Player 2 turn");
							}
							else
							{
								t=1;
								tf.setText("Player 1 turn");
								a8.setText("*");
							}
						}
						//a[8]=0;
					}
					else
						tf.setText("Invalid Input");
						
				}  
			});
			
		JButton a9=new JButton("RST");
		a9.setBounds(201,0,100,100);
		a9.setFont(bfn);
		a9.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					a0.setText(null);
					a1.setText(null);
					a2.setText(null);
					a3.setText(null);
					a4.setText(null);
					a5.setText(null);
					a6.setText(null);
					a7.setText(null);
					a8.setText(null);
					tf.setText("Start...P1 turn");
					t=1;
					for(i=0;i<9;i++)
						a[i]=3;
				}  
			});
		
		f.add(a9);
		f.add(tf);
		f.add(a0);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.add(a5);
		f.add(a6);
		f.add(a7);
		f.add(a8);
		f.add(a1);
		
		f.setSize(321,450);
		f.setLayout(null);
		f.setVisible(true);
	}
}