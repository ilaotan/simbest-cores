package com.simbest.cores.app.mapper;

import com.simbest.cores.app.model.ProcessAuditLog;
import com.simbest.cores.mapper.IGenericMapper;

public interface ProcessAuditLogMapper extends IGenericMapper<ProcessAuditLog,Long> {
    /**
     * 删除第一条起草日志
     *
     * @param o
     * @return
     */
    int deleteCreationLog(ProcessAuditLog o);

    /**
     * 修改日志审批意见
     *
     * @param o
     * @return
     */
    int updateLogOpnion(ProcessAuditLog o);
}
