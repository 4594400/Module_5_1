package ua.goit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ua.goit.common.OperationExecutor;
import ua.goit.common.OperationProvider;
import ua.goit.parser.Parser;
import ua.goit.parser.ParserDouble;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public OperationExecutor operationExecutor() {
        OperationExecutor operationExecutor = new OperationExecutor();
        operationExecutor.setOperationProvider(operationProvider());
        operationExecutor.setParser(parser());
        return operationExecutor;
    }


    @Bean
    public OperationProvider operationProvider() {
        OperationProvider operationProvider  =  new OperationProvider();
        operationProvider.init();
        return operationProvider;
    }

    @Bean
    @Scope("prototype")
    public Parser parser() {
        Parser parser = new ParserDouble();
        return parser;
    }
}