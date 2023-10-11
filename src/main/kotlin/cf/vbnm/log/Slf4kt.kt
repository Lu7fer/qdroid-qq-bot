package cf.vbnm.log

import org.slf4j.Logger
import org.slf4j.LoggerFactory


class Slf4kt {
    companion object {
        fun getLogger(clazz: Class<*>): Logger {
            return LoggerFactory.getLogger(clazz)
        }

        fun getLogger(name: String): Logger {
            return LoggerFactory.getLogger(name)
        }
    }
}


