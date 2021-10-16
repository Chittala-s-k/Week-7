package TroubleTicketRouting;

public class Ticket {
	 
	 int id = 33;
	 String who;
	 String phone;
	 String tag;
	 String date;
	 String problem;
	 String notes;
	 String status;
	 String worker;

	     Ticket(String who, String phone, String tag, String date, String problem, String notes){
	     this.who = who;
	     this.phone = phone;
	     this.tag = tag;
	     this.date = date;
	     this.problem = problem;
	     this.notes = notes;
	     } 
	     
	     Ticket(){
	    	 
	     }
	     Ticket(int id, String who, String phone, String tag,  String date, String problem, String notes){
	    	    this.id = id;
	    	    this.who = who;
	    	    this.phone = phone;
	    	    this.tag = tag;
	    	    this.date = date;
	    	    this.problem = problem;
	    	    this.notes = notes;
	    	    this.status = "NEW";
	    	    }  
	    	
	    	 Ticket(int id, String who, String phone, String tag,  String date, String problem, String notes, String status){
	    	    this.id = id;
	    	    this.who = who;
	    	    this.phone = phone;
	    	    this.tag = tag;
	    	    this.date = date;
	    	    this.problem = problem;
	    	    this.notes = notes;
	    	    this.status = status;
	    	    }  

}
