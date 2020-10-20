import java.util.*;
class TrainTicketReservation
{
static void tickettype(int choice, int n,HashMap<String,Double>ha,String s1)
{
double price=ha.get(s1);
if(choice==0)
{
 System.out.println("Price is "+price*n);
}
else
{
 double per = 0.1;
 price=price+(price*(per));
 System.out.println("Price is "+price*n);
}
}
static void cancel(int n,HashMap<String,Integer>h,String val)
{
int key=h.get(val);
h.replace(val,key+n);
System.out.println("Successfully cancelled");
System.out.println(h);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
HashMap<String,Double>ha=new HashMap<String,Double>();
ha.put("Express1",1000.0);
ha.put("Express2",2000.0);
ha.put("Express3",3000.0);
HashMap<String,String>hm=new HashMap<String,String>();
hm.put("Monica","apple");
hm.put("Chakri","banana");
hm.put("Chutki","guava");
hm.put("Raju","mango");
System.out.println("Enter username");
String user=sc.next();
if(hm.containsKey(user))
{
 System.out.println("Enter Password");
 String pass=sc.next();
if(pass.equals(hm.get(user)))
{
 System.out.println("Login Successfull");
}
else
{
 System.out.println("Invalid Password");
 return;
}
}
else
{
 System.out.println("Invalid Username");
 return;
}
ArrayList<String>cities=new ArrayList<String>();
cities.add("Mumbai");
cities.add("Pune");
cities.add("Bangalore");
cities.add("Hyderabad");
cities.add("Kolkata");
cities.add("Delhi");
cities.add("Chennai");
HashMap<String,Integer> h=new HashMap<String,Integer>();
h.put("Express1",30);
h.put("Express2",30);
h.put("Express3",30);
int m;
System.out.println("Enter number of test cases");
m=sc.nextInt();
while(m>0)
{
 System.out.println("Enter src");
 String source=sc.next();
if(cities.contains(source))
{
 System.out.println("Enter des");
 String destination=sc.next();
if(cities.contains(destination))
{
 System.out.println("List of Avalaible trains:1.Express1 2.Express2 3.Express3");
 System.out.println("Enter train name");
 String name=sc.next();
if(h.containsKey(name))
{
 System.out.println("Enter no of tickets");
 int n=sc.nextInt();
 //int r=0;
if(h.get(name)>n)
{
System.out.println("Enter type of ticket: 0->Not window,1->Window");
 int option=sc.nextInt();
 tickettype(option,n,ha,name);
 System.out.println("Tickets Succesfully booked");
 System.out.println("Booking details:");
 System.out.println("Passenger name: "+ user);
 System.out.println("Boarding point: "+ source);
 System.out.println("Drop Location: "+ destination);
 System.out.println("Train name: "+ name);
 System.out.println("No.of Tickets: "+ n);
 int value=h.get(name);
 h.replace(name,value-n);
 System.out.println(h);
}
else
{
 System.out.println("Waiting list");
 return;
}
 System.out.println("Do you Want to cancel 1->yes 0->No");
 int k=sc.nextInt();
if(k==1)
  cancel(n,h,name);
}
}
else
{
 System.out.println("Invalid destination city");
}
}
else
{
 System.out.println("Invalid Source city");
}
m--;
}
}
}
