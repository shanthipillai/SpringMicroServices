package spring.training.artifacts;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("db")
public class DatabaseOperations {
	@Autowired
JdbcTemplate jdbcTemplate;

public void addProduct()
{
	String sql="insert into emp values(?,?)";
	int sucessorfail=jdbcTemplate.update(sql,555,"allocate");
	System.out.println(sucessorfail);
	//jdbcTemplate.execute("select * from emp");
	
}

public void queryAll()
{
	String sql="select * from emp";
	List<Employee> emplist=jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
	/*Iterator<Employee> itr=emplist.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next().getEmpid()+""+itr.next().getEname());
    }
    */
	
	for(Employee emp:emplist)
	{
		System.out.println(emp.getEmpid()+""+emp.getEname());
	}
	

}

public void queryIds()
{
	String sql="select empid from emp";
	List<Integer> list=jdbcTemplate.queryForList(sql,Integer.class);
	for(int id:list)
	{
		System.out.println(id);
	}
}


public void queryByObject()
{
	String sql="select * from emp where empid=1234";
	Employee emp=jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
	System.out.println(emp.getEmpid());
	System.out.println(emp.getEname());
	}
}



