package com.fk.memory.service;

import com.fk.memory.pojo.MemoryAllocationRequest;
import com.fk.memory.pojo.MemoryResponse;
import javafx.util.Pair;

import java.util.List;
import java.util.Map;

public interface MemoryManger {
    MemoryResponse allocate(MemoryAllocationRequest memoryAllocationRequest);
    MemoryResponse free(String process, String variable);
    MemoryResponse kill(String process);
    Map<String,List<Pair>> inspect(String process);
}