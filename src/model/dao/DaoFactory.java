package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

//classe auxiliar que instancia os DAOs
//macete para n�o expor a implementa��o deixando somente a interface
//inje��o de dependencia que n�o explicita a implementa��o
public class DaoFactory {

	public static SellerDao createSellerDao(){
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDao createDepartmentDao(){
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
