package com.team.bookstore.Dtos.Responses;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GalleryManageResponse {
    int id;
    int book_id;
    byte[] thumbnail;
    String description;
    Date createAt;
    Date updateAt;
    String createBy;
    String updateBy;
}
