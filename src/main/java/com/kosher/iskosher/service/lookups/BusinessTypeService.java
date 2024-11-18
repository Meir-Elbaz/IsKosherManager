package com.kosher.iskosher.service.lookups;

import com.kosher.iskosher.common.lookup.AbstractLookupService;
import com.kosher.iskosher.common.lookup.LookupRepository;
import com.kosher.iskosher.dto.BusinessTypeDto;
import com.kosher.iskosher.entity.BusinessType;
import com.kosher.iskosher.model.types.BusinessTypeModel;
import com.kosher.iskosher.repository.lookups.BusinessTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class BusinessTypeService extends AbstractLookupService<BusinessType, BusinessTypeDto> {


    public BusinessTypeService(BusinessTypeRepository repository) {
        super(repository, BusinessType.class);
    }
    @Override
    protected BusinessType createEntity(BusinessTypeDto dto) {
        BusinessType newBusinessType = new BusinessType();
        newBusinessType.setName(dto.name());
        return newBusinessType;
    }

    @Override
    protected BusinessTypeDto mapToDto(BusinessType entity) {
        return new BusinessTypeDto(entity.getId(), entity.getName());
    }

}
