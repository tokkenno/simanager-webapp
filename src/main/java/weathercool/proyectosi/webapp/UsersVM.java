package weathercool.proyectosi.webapp;

import java.util.HashSet;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

public class UsersVM {
    private int mierda;
/*
	// department under edition...
	private Department currentDepartment = null;
	
	public Department getCurrentDepartment() {
		return currentDepartment;
	}
	
	public List<Department> getDepartments() {
		EntityManager em = DesktopEntityManagerManager.getDesktopEntityManager();
		return em.createQuery("SELECT d FROM Department d", Department.class).getResultList();
	}
	
	@Command
	@NotifyChange("departments")
	public void delete(@BindingParam("d") Department department) {
		EntityManager em = DesktopEntityManagerManager.getDesktopEntityManager();
		TransactionUtils.doTransaction(em, __ -> {
			Set<Employee> employeesCopy = new HashSet<>(department.getEmployees());
			
			for (Employee myEmployee: employeesCopy) {
				myEmployee.setDepartment(null);
			}
			
			em.remove(department);
		});
	}
	
	@Command
	@NotifyChange("currentDepartment")
	public void newDepartment() {
		this.currentDepartment = new Department();
	}
	
	@Command
	@NotifyChange({"departments", "currentDepartment"})
	public void save() {
		EntityManager em = DesktopEntityManagerManager.getDesktopEntityManager();
		TransactionUtils.doTransaction(em, __ -> {
			em.persist(this.currentDepartment);
		});
		this.currentDepartment = null;
	}
	
	@Command
	@NotifyChange("currentDepartment")
	public void cancel() {
		this.currentDepartment = null;
	}
	
	@Command
	@NotifyChange("currentDepartment")
	public void edit(@BindingParam("d") Department department) {
		this.currentDepartment = department;
	}*/
}