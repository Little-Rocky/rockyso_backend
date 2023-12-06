package com.yupi.rockyso;

import cn.hutool.http.HttpRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CrawlerTest {

    @Test
    void testFetchPassage() {
        String json = "{\"current\":1,\"pageSize\":8,\"sortField\":\"createTime\",\"sortOrder\":\"descend\",\"category\":\"文章\",\"reviewStatus\":1}";
        String result = HttpRequest.post("https://www.code-nav.cn/api/post/search/page/vo")
                .body(json)
                .execute().body();
        System.out.println(result);
    }
}
