package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.repository.InvoiceRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave() {

        //Given
        Item item1 = new Item(new BigDecimal(100), 1, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(200), 2, new BigDecimal(100));
        Product product = new Product("PhoneCarHolder");
        Invoice invoice = new Invoice("Fv/1/07/2020");
        product.getItems().add(item1);
        product.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceRepository.deleteById(id);
    }
}
