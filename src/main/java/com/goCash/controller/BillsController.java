package com.goCash.controller;

import com.goCash.dto.request.ElectricityBillRequest;
import com.goCash.services.ElectricityBillService;
import com.goCash.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/go-cash/paybill")
@RequiredArgsConstructor
public class BillsController {
    private final ElectricityBillService electricityBillService;

    @PostMapping("/electricity/pay")
    public ResponseEntity<ApiResponse> payElectricityBill(@RequestBody ElectricityBillRequest electricityBillRequest) {
        log.info("request to pay for electricity units.");
        ApiResponse transactionStatusResponse = electricityBillService.payElectricityBill(electricityBillRequest);
        return ResponseEntity.ok(transactionStatusResponse);
    }
}
