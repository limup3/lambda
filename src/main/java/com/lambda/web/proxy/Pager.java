package com.lambda.web.proxy;

import com.lambda.web.mappers.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pager {
    @Autowired MovieMapper movieMapper;
    private int rowCount, startRow, endRow,
            pageCount,pageSize,startPage,endPage, nowPage,
            blockCount,blockSize,prevBlock,nextBlock, nowBlock;
    private boolean existPrev, existNext;
    private String search;
    public void paging() {

        rowCount = movieMapper.count(); // 300
        pageSize = 5;
        pageCount = (rowCount % pageSize != 0) ? rowCount / pageSize + 1 : rowCount / pageSize; // 60,61
        blockSize = 5;
        blockCount = (pageCount % blockSize != 0) ? pageCount / blockSize +1 : pageCount / blockSize; // 12,13
        nowPage = 1;
        startRow = ((nowPage-1) * pageSize) + 1; //1 ,6, 11...
        endRow = (nowPage==pageCount)? rowCount : nowPage*pageSize; // 5,10,25 ...
        nowBlock = (nowPage % blockSize !=0) ? nowPage / blockSize+1 : nowPage / blockSize; //
        startPage = ((nowBlock-1) * blockSize) + 1; //
        endPage = (nowBlock==pageCount)? rowCount : nowPage*blockSize;
        prevBlock = startPage - blockSize;
        nextBlock = startPage + blockSize;
        existPrev = (nowBlock != 1);
        existNext = (nowBlock != blockCount);
    }
}
