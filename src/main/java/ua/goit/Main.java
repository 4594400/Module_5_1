package ua.goit;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.goit.common.OperationExecutor;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(getOperationExecutor(applicationContext).executeOperation("32 - 5"));
        System.out.println(getOperationExecutor(applicationContext).executeOperation("800 - 200"));
        System.out.println(getOperationExecutor(applicationContext).executeOperation("32.6f - 6.3f"));
        System.out.println(getOperationExecutor(applicationContext).executeOperation("52.6 - 16.3"));



       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        OperationExecutor operationExecutor = applicationContext.getBean("operationExecutor", OperationExecutor.class);
        System.out.println(operationExecutor.executeOperation("32 - 5"));
        System.out.println(operationExecutor.executeOperation("800 - 200"));
        System.out.println(operationExecutor.executeOperation("32.6f - 6.3f"));
        System.out.println(operationExecutor.executeOperation("52.6 - 16.3"));*/


    }

    private static OperationExecutor getOperationExecutor(ApplicationContext applicationContext) {
        return applicationContext.getBean("operationExecutor", OperationExecutor.class);
    }
}
