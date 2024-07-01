
package ex_25May2024_WrapperClasses;

public class Lab162_Enum_Example1 {

	public static void main(String[] args) {
		HTTPStatusCODE status = HTTPStatusCODE.NO_CONTENT;
		System.out.println(status.getCode() + "-->"+ status.getMessage());
	}
}

enum HTTPStatusCODE{
	OK(200 , "OK"),
	CREATED(201, "Created"),
	ACCEPTED(202, "Accepted"),
	NO_CONTENT(204, "No_Content"),
	BAD_REQUEST(400, "Bad_Request"),
	UNAUTHORIZED(401, "Unauthorized"),
	FORBIDDEN(403, "Forbidden"),
	NOT_FOUND(404, "Not_Found"),
	INTERNAL_SERVER_ERROR(500, "Internal_Server_Error");
	
	private int code;
	private String message;
	
	HTTPStatusCODE(int code , String message){
		this.code = code;
		this.message = message; 
	}
	
	 int getCode() {
		return code;
     }
	void setCode(int code) {
		this.code=code;
     }
	String getMessage() {
		return message;
	}
	void setMessage(String message) {
		this.message=message;
	}
	
}
