package hibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wixsite.mupbam1.models.FamilyMember;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static {
			sessionFactory = new Configuration()
					.configure()
					.addAnnotatedClass(FamilyMember.class)
					.buildSessionFactory();
		}
	public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	public static void closeSessionFactory() {
        sessionFactory.close();
    }
}
