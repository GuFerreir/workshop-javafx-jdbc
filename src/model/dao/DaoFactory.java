package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

//classe auxiliar que instancia os DAOs
//macete para não expor a implementação deixando somente a interface
//injeção de dependencia que não explicita a implementação
public class DaoFactory {

	public static SellerDao createSellerDao(){
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDao createDepartmentDao(){
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
