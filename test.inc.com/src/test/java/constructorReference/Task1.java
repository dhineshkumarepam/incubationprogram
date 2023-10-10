package constructorReference;

	class Task1Employee {
	    private String name;
	    private String account;
	    private double salary;

	    public Task1Employee(String name, String account, double salary) {
	        this.name = name;
	        this.account = account;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAccount() {
	        return account;
	    }

	    public double getSalary() {
	        return salary;
	    }
	}

	


