CREATE TABLE IF NOT EXISTS service_request (
    id SERIAL PRIMARY KEY,
    promoter VARCHAR(50) NOT NULL,
    company VARCHAR(50) NOT NULL,
    customer_id INT NOT NULL,
    request_id VARCHAR(12) NOT NULL
);
