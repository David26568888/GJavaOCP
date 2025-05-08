package day07;

import java.util.stream.Stream;

//解釋互相繼承 最後繼承的class 可以調用全部之前所繼承的資源

public class CompanyTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("基本員工:");
		System.out.println(employee.salary);
		
		Manager manager = new Manager();
		System.out.println("經理:");
		System.out.println(manager.salary);
		System.out.println(manager.budget);
		
		Supervisor supervisor = new Supervisor();
		System.out.println("主管:");
		System.out.println(supervisor.salary);
		System.out.println(supervisor.budget);
		System.out.println(supervisor.stock);
		
		Employee[] employees = {employee,manager,supervisor};
		System.out.println(employees[0].salary);
		System.out.println(employees[1].salary);//因為限制在Employee作陣列 僅能調用Employee資源
		System.out.println(employees[2].salary);
		System.out.println("---------------------");
		
		for(int i=0; i<employees.length;i++) {
			System.out.println(employees[i].salary);
		}
		System.out.println("----------------------");
		
		for (Employee emp : employees) {
			System.out.println(emp.salary);
		}
		System.out.println("----------------------");
		
		//Manager[] managers = {employee,manager,supervisor};//employee 不能包進去 Manager 類別
		Manager[] managers = {manager,supervisor};//employee 不能包進去 Manager 類別
		
		//利用java stream 的foreach >>>Stream.of(陣列名).forEach(任意名->{要做什麼});
		Stream.of(managers)
			.forEach(mgr->{
			System.out.println(mgr.salary);
			System.out.println(mgr.budget);
		});
	}
	
	
}
