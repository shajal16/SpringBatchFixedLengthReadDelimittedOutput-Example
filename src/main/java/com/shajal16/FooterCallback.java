package com.shajal16;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.item.file.FlatFileFooterCallback;

import java.io.IOException;
import java.io.Writer;

public class FooterCallback extends StepExecutionListenerSupport implements FlatFileFooterCallback{

    private StepExecution stepExecution;

    @Override
    public void writeFooter(Writer writer) throws IOException {
       writer.write("T|" + stepExecution.getWriteCount());
        //       writer.write("footer -  ");
    }

    @Override
    public void beforeStep(StepExecution stepExecution) {
        this.stepExecution = stepExecution;
    }


}