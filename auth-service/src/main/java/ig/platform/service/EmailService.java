package ig.platform.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class EmailService {

    private static final Logger LOGGER = Logger.getLogger(EmailService.class.getName());

    public void sendEmail(final String toAddress) {
        // send email to toAddress
        LOGGER.info("Email successfully sent");
    }
}
