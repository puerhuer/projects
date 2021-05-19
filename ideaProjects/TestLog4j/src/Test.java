import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

/**
 * @Classname : Test
 * @Description : TODO
 * @Created by kingdee
 * @Date : 2021/5/18
 */
public class Test {

    public static void main(String[] args) {
        Logger logger = (Logger) LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

    }
}
