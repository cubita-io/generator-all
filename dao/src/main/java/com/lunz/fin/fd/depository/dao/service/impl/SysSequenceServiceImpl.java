package com.lunz.fin.fd.depository.dao.service.impl;

import com.lunz.fin.fd.depository.dao.entity.SysSequence;
import com.lunz.fin.fd.depository.dao.mapper.SysSequenceMapper;
import com.lunz.fin.fd.depository.dao.service.ISysSequenceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 自定义主键规则表 服务实现类
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@Service
public class SysSequenceServiceImpl extends ServiceImpl<SysSequenceMapper, SysSequence> implements ISysSequenceService {

}
