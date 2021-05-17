package cn.bincker.web.blog.netdisk.service.dto;

import cn.bincker.web.blog.base.constant.RegexpConstant;
import cn.bincker.web.blog.netdisk.service.dto.valid.CreateDirectoryValid;
import cn.bincker.web.blog.netdisk.service.dto.valid.UpdateValid;
import cn.bincker.web.blog.netdisk.service.dto.valid.UploadFileValid;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.util.Collections;
import java.util.Set;

@Data
public class NetDiskFileDto {
    @Null(groups = {CreateDirectoryValid.class, UploadFileValid.class})
    @NotNull(groups = {UpdateValid.class})
    private Long id;

    @NotEmpty(groups = CreateDirectoryValid.class)
    @Pattern(regexp = RegexpConstant.FILE_NAME, groups = CreateDirectoryValid.class)
    @Length(max = 255, groups = CreateDirectoryValid.class)
    @Null(groups = UploadFileValid.class)
    private String name;
    private Long parentId;
    private Boolean everyoneReadable = false;
    private Boolean everyoneWritable = false;
    private Set<Long> readableUserList = Collections.emptySet();
    private Set<Long> writableUserList = Collections.emptySet();
}
