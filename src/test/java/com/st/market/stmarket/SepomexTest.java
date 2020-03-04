package com.st.market.stmarket;

import au.com.bytecode.opencsv.CSVReader;
import com.st.market.stmarket.api.sepomex.model.Sepomex;
import com.st.market.stmarket.api.sepomex.repository.SepomexRepository;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.integration.properties")
@Disabled
public class SepomexTest {

    @Autowired
    SepomexRepository repository;

    @Test
    public void proceed() throws Exception {
        for (int index = 1; index < 32; index++) {
            String SAMPLE_CSV_FILE_PATH = "/home/janez/Desktop/sepomex/" + index + ".csv";
            try (
                    Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                    CSVReader csvReader = new CSVReader(reader);) {
                String[] nextRecord;
                int row = 0;
                while ((nextRecord = csvReader.readNext()) != null) {
                    if (row > 0) {
                        Sepomex model = new Sepomex();
                        model.setD_codigo(new Long(nextRecord[0]));
                        model.setD_asenta(nextRecord[1]);
                        model.setD_tipo_asenta(nextRecord[2]);
                        model.setD_mnpio(nextRecord[3]);
                        model.setD_estado(nextRecord[4]);
                        model.setD_ciudad(nextRecord[5]);

                        repository.save(model);
                    }
                    row++;

                }
            }

        }
    }

}
