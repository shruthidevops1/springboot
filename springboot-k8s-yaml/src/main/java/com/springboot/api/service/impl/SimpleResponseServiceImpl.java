package com.springboot.api.service.impl;

import com.springboot.api.service.SimpleResponseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.zone.ZoneRulesException;

@Service
public class SimpleResponseServiceImpl implements SimpleResponseService {

    private static final String RESPONSE_MESSAGE_PREFIX = "Automate All The Things. ";

    @Override
    public String buildAndReturnResponse() {
        return RESPONSE_MESSAGE_PREFIX + LocalDateTime.now();
    }

    @Override
    public String buildAndReturnResponse(String timezone) {
        try {
            return RESPONSE_MESSAGE_PREFIX + LocalDateTime.now(ZoneId.of(timezone));
        } catch (ZoneRulesException zoneRulesException) {
            zoneRulesException.printStackTrace();
            throw new RuntimeException(zoneRulesException.getMessage() + " only these are supported" + ZoneId.getAvailableZoneIds());
        }
    }
}
