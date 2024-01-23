CREATE TABLE IF NOT EXISTS credit_request (
    request_id VARCHAR(12) PRIMARY KEY,
    promoter VARCHAR(50) NOT NULL,
    company VARCHAR(50) NOT NULL,
    status VARCHAR(15) NOT NULL,
    customer_id INT NOT NULL
);
