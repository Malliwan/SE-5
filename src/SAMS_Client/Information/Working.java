package Information;

import java.io.Serializable;

public class Working extends Scholar implements Serializable{
	public String Working_type;
	public int std_income;	//standard of income
	public int std_grade; 	//standard of grade
	private static final long serialVersionUID = 1L;
	
	public Working(String name) {
		this.setName(name);
		this.setType(1);
		// TODO Auto-generated constructor stub
	}
	
	public int getStd_income() {
		return std_income;
	}

	public void setStd_income(int std_income) {
		this.std_income = std_income;
	}

	public String getWorking_type() {
		return Working_type;
	}

	public void setWorking_type(String working_type) {
		Working_type = working_type;
	}
	
}