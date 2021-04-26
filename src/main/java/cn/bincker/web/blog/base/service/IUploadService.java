package cn.bincker.web.blog.base.service;

import cn.bincker.web.blog.base.entity.UploadFile;
import cn.bincker.web.blog.base.service.dto.UploadFileDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface IUploadService {
    List<UploadFileDto> upload(Collection<MultipartFile> files, boolean isPublic);

    Optional<UploadFile> getUploadFile(Long id);
}
