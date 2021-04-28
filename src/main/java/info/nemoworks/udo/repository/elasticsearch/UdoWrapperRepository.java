package info.nemoworks.udo.repository.elasticsearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import info.nemoworks.udo.model.Udo;
import info.nemoworks.udo.model.UdoSchema;
import info.nemoworks.udo.storage.UdoNotExistException;
import info.nemoworks.udo.storage.UdoPersistException;
import info.nemoworks.udo.storage.UdoRepository;

@Component
public class UdoWrapperRepository implements UdoRepository {

    @Autowired
    private UdoDocumentRepository documentRepository;

    @Override
    public void deleteSchemaById(String id) throws UdoNotExistException {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteUdoById(String id) throws UdoNotExistException {
        // TODO Auto-generated method stub

    }

    @Override
    public List<UdoSchema> findAllSchemas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UdoSchema findSchemaById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Udo findUdoById(String id) {
        UdoDocument document = documentRepository.findById(id);
        

        return null;
    }

    @Override
    public List<Udo> findUdosBySchema(UdoSchema schema) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UdoSchema saveSchema(UdoSchema udoSchema) throws UdoPersistException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Udo saveUdo(Udo udo) throws UdoPersistException {

        UdoDocument document = new UdoDocument(udo.getId(), udo.getSchema().toJsonObject(), udo.getData());

        documentRepository.save(document);
        return null;
    }

    @Override
    public Udo sync(Udo udo) throws UdoPersistException {
        // TODO Auto-generated method stub
        return null;
    }

}